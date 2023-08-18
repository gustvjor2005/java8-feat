package lamdas.quiz;

import lamdas.Apple;

public class PrintAppleColorPredicate implements PrintApplePredicate{

	@Override
	public String prettyPrint(Apple apple) {
		// TODO Auto-generated method stub
		return "the color of apple is "+apple.getColor();
	}
}
