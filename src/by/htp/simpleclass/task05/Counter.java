package by.htp.simpleclass.task05;

/*
 *5. Опишите класс, реализующий десятичный счетчик,
 * который может увеличивать или уменьшать свое значение на единицу
 *  в заданном диапазоне. Предусмотрите инициализацию счетчика значениями 
 *  по умолчанию и произвольными значениями. Счетчик имеет методы увеличения 
 *  и уменьшения состояния, и метод позволяющее получить его текущее состояние. 
 *  Написать код, демонстрирующий все возможности класса. 
 */

public class Counter {

	    private int counterStatus;
	    private int counterCycle;

	    Counter(){
	        this.counterStatus = 0;
	        this.counterCycle = 0;
	    }

	    Counter(int startPosit){
	        if(startPosit >= 0 && startPosit < 10 ) {
	            counterStatus = startPosit;
	            counterCycle = 0;
	        }else if(startPosit >= 10){
	            counterStatus = startPosit % 10;
	            counterCycle = startPosit / 10;
	        }

	    }
	    public void print() {
			System.out.println("counterStatus " + counterStatus);
			System.out.println("counterCycle " + counterCycle);
		}

	    public int getCounterStatus(){
	        return counterStatus;
	    }

	    public void setCounterStatus(int counterStatus) {
			this.counterStatus = counterStatus;
		}

		
		public int getCounterCycle(){
	        return counterCycle;
	    }

		public void setCounterCycle(int counterCycle) {
			this.counterCycle = counterCycle;
		}
	  
		public int positCount(int steps){
	        for(int i = 0; i < steps; i++) {
	            if (counterStatus < 10) {
	                counterStatus++;
	            } else {
	                counterCycle++;
	                counterStatus = 0;

	            }
	        }
	        return counterStatus;
	    }

	    public int negotCount(int steps){
	        for(int i = 0; i < steps; i++){
	            if(counterStatus > 0){
	                counterStatus--;
	            }else{
	                counterCycle--;
	                counterStatus = 9;
	            }
	        }
	        return counterStatus;
	    }


	}

