package by.htp.simpleclass.view;

import java.util.List;
import java.util.ArrayList;

import by.htp.simpleclass.train.Date;
import by.htp.simpleclass.train.Train;

public class TrainConsoleInput {
	public List<Train> create() {
		List<Train> trains = new ArrayList<Train>();

		Train tr = new Train(123, "Minsk", new Date(2020, 2, 12, 12, 12));
		trains.add(tr);

		tr = new Train(455, "Brest", new Date(2020, 2, 12, 11, 35));
		trains.add(tr);

		tr = new Train(12, "Orsha", new Date(2020, 2, 1, 22, 15));
		trains.add(tr);

		tr = new Train(346, "Vitebsk", new Date(2020, 2, 12, 12, 45));
		trains.add(tr);

		tr = new Train(498, "Orsha", new Date(2020, 2, 12, 14, 35));
		trains.add(tr);

		return trains;

	}

}
