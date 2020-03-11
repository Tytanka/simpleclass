package by.htp.simpleclass.main;

import java.util.List;
import by.htp.simpleclass.train.Train;
import by.htp.simpleclass.service.TrainLogic;
import by.htp.simpleclass.view.TrainConsoleInput;
import by.htp.simpleclass.view.TrainView;
import by.htp.simpleclass.service.TrainAction;

public class Main {
	public static void main(String[] args) {
		TrainView view = new TrainView();
		TrainConsoleInput input = new TrainConsoleInput();

		TrainLogic logic = new TrainLogic();

		List<Train> trains;
		trains = input.create();

		view.print(trains);

		System.out.println("--------------");

		logic.sortByNumber(trains);

		view.print(trains);

		System.out.println("--------------");

		TrainAction.sortByStationAndDate(trains);

		view.print(trains);

	}

}
