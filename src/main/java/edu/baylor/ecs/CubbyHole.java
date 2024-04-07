package edu.baylor.ecs;

class CubbyHole {
	private int seq;
	private boolean available = false;

	public synchronized int get() {
		while (!available) {
			try {
				wait();
			} catch (InterruptedException e) {
			}
		}
		available = false;
		notify();
		return seq;
	}

	public synchronized void put(int value) {
		while (available) {
			try {
				wait();
			} catch (InterruptedException e) {
			}
		}
		seq = value;
		available = true;
		notify();
	}
}