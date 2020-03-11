package by.htp.simpleclass.service;

import java.util.List;

import by.htp.simpleclass.train.Train;

public class TrainLogic {
	public Train findTrainByNumber(List<Train> trains, int trainNumber) {

		for (Train train : trains) {
			if (train.getNumber() == trainNumber) {
				return train;
			}
		}
		return null;
	}

	public void sortByNumber(List<Train> trains) {

		for (int i = 0; i < trains.size() - 1; i++) {
			int minTrainNumber = trains.get(i).getNumber();
			int minTrainNumberIndex = i;

			for (int j = i + 1; j < trains.size(); j++) {
				Train currentTrain = trains.get(j);
				
				if(minTrainNumber > currentTrain.getNumber()) {
					minTrainNumber = currentTrain.getNumber();
					minTrainNumberIndex = j;
				}

			}
			
			Train temp1 = trains.get(i);
			Train temp2 = trains.get(minTrainNumberIndex);
			
			trains.set(i, temp2);
			trains.set(minTrainNumberIndex, temp1);	
			
		}
		
	}

}

