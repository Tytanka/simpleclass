package by.htp.simpleclass.service;

import java.util.ArrayList;
import java.util.List;

import by.htp.simpleclass.train.Date;
import by.htp.simpleclass.train.Train;

public class TrainAction {
	public static void sortByStation(List<Train> trains) {

		for (int i = 0; i < trains.size() - 1; i++) {
			String dest1 = trains.get(i).getDestinationStation();

			int dest1Index = i;

			for (int j = i + 1; j < trains.size(); j++) {
				String dest2 = trains.get(j).getDestinationStation();
				if (dest1.compareTo(dest2) > 0) {
					dest1 = dest2;
					dest1Index = j;
				}

			}

			Train temp1 = trains.get(i);
			Train temp2 = trains.get(dest1Index);

			trains.set(i, temp2);
			trains.set(dest1Index, temp1);
		}
	}

	public static List<Integer> findDublicateStation(List<Train> trains, int from) {

		List<Integer> result = new ArrayList<Integer>();
		int start;
		int end;

		for (int i = from; i < trains.size() - 1; i++) {
			for (int j = i + 1; j < trains.size(); j++) {
				if (trains.get(i).getDestinationStation().equals(trains.get(i + 1).getDestinationStation())) {
					start = i;
					result.add(0, start);

					end = j;
					result.add(1, end);

				}
			}

		}

		return result;

	}

	public static void sortByDate(List<Train> trains, int start, int end) {

		for (int i = start; i <= end; i++) {
			Date date1 = trains.get(i).getDate();
			int dateIndex = i;

			for (int j = i + 1; j <= end; j++) {
				Date date2 = trains.get(j).getDate();

				if (date1.getHour() > date2.getHour()) {
					date1 = date2;
					dateIndex = j;
				}
			}

			Train temp1 = trains.get(i);
			Train temp2 = trains.get(dateIndex);

			trains.set(i, temp2);
			trains.set(dateIndex, temp1);

		}

	}

	public static void sortByStationAndDate(List<Train> trains) {

		int start = 0;
		List<Integer> range;

		sortByStation(trains);
		range = findDublicateStation(trains, start);

		sortByDate(trains, range.get(0), range.get(1));

		start = range.get(1);

		range = findDublicateStation(trains, start + 1);
	}

}