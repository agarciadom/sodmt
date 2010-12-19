package es.uca.modeling.eol.comparison.stats;

/**
 * Simple class which builds up some easy statistics from the input data.
 * 
 * @author Antonio García-Domínguez
 * @version 1.0
 */
public class SeriesStatistics {

	private long nSamples = 0;
	private double min = Double.POSITIVE_INFINITY;
	private double max = Double.NEGATIVE_INFINITY;
	private double sum = 0;

	public void addSample(double sample) {
		min = Math.min(min, sample);
		max = Math.max(max, sample);
		sum += sample;
		nSamples++;
	}

	public double getMinimum() {
		checkSamples();
		return min;
	}

	public double getMaximum() {
		checkSamples();
		return max;
	}

	public double getAverage() {
		checkSamples();
		return sum/nSamples;
	}

	private void checkSamples() {
		if (nSamples == 0) {
			throw new IllegalStateException("No samples available");
		}
	}
}
