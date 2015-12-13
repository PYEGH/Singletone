package com.epam.singletonexample.model;

/**
 * Class contains singletone realization.
 * @author Pavel
 *
 */
public class SuperMan {
	private static SuperMan instance;

	private SuperMan() {

	}

	public static SuperMan getInstance() {
		if (instance == null) {
			synchronized (SuperMan.class) {
				if (instance == null) {
					instance = new SuperMan();
				}
			}
		}
		return instance;
	}
}
