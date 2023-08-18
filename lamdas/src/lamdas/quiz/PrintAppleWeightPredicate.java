package lamdas.quiz;

import lamdas.Apple;

public class PrintAppleWeightPredicate implements PrintApplePredicate {

	@Override
	public String prettyPrint(Apple apple) {
		// TODO Auto-generated method stub
		return "the weight of apple "+ apple.getId() + " is " + apple.getWeight();
	}
}
