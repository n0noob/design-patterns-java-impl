package com.learn.design_patterns.creational.singleton;

public final class Singleton {
	private static volatile Resource instance = null;
	private static Object objectLock = new Object();

	private Singleton() {
		if (instance != null) {
			throw new RuntimeException("Cannot instantiate!");
		}
	}

	public static Resource getInstance() {

		if (instance == null) {
			synchronized (objectLock) {
				/*
				 * Double checking because there could be multiple threads penetrating the first check 
				 * 		and waiting for acquiring the lock. Once first thread is done creating the instance
				 * 		others will again try creating their own instance without this second check
				 */
				if(instance == null)
					instance = new Resource();
			}
		}

		return instance;
	}

}
