package com.example.moths.model;

import java.util.ArrayList;

import com.example.moths.enums.*;

public class IdRequest {
	private Antennae antennae;
	private ArrayList<Pattern> patterns;
	private Wingshape wingshape;
	private ArrayList<Color> colors;	
	private ExtraFeatures features;
	
	public IdRequest() {
		super();
	}
	
	public IdRequest(Antennae antennae,
			ArrayList<Pattern> patterns,
			Wingshape wingshape,
			ArrayList<Color> colors,
			ExtraFeatures features) {
		this.antennae = antennae;
		this.patterns = patterns;
		this.wingshape = wingshape;
		this.colors = colors;
		this.features = features;
	}

	public Antennae getAntennae() {
		return antennae;
	}

	public void setAntennae(Antennae antennae) {
		this.antennae = antennae;
	}

	public ArrayList<Pattern> getPatterns() {
		return patterns;
	}

	public void setPatterns(ArrayList<Pattern> patterns) {
		this.patterns = patterns;
	}

	public Wingshape getWingshape() {
		return wingshape;
	}

	public void setWingshape(Wingshape wingshape) {
		this.wingshape = wingshape;
	}

	public ArrayList<Color> getColors() {
		return colors;
	}

	public void setColors(ArrayList<Color> colors) {
		this.colors = colors;
	}

	public ExtraFeatures getFeatures() {
		return features;
	}

	public void setFeatures(ExtraFeatures features) {
		this.features = features;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((antennae == null) ? 0 : antennae.hashCode());
		result = prime * result + ((colors == null) ? 0 : colors.hashCode());
		result = prime * result + ((features == null) ? 0 : features.hashCode());
		result = prime * result + ((patterns == null) ? 0 : patterns.hashCode());
		result = prime * result + ((wingshape == null) ? 0 : wingshape.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		IdRequest other = (IdRequest) obj;
		if (antennae != other.antennae)
			return false;
		if (colors == null) {
			if (other.colors != null)
				return false;
		} else if (!colors.equals(other.colors))
			return false;
		if (features != other.features)
			return false;
		if (patterns == null) {
			if (other.patterns != null)
				return false;
		} else if (!patterns.equals(other.patterns))
			return false;
		if (wingshape != other.wingshape)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "IdRequest [antennae=" + antennae + ", patterns=" + patterns + ", wingshape=" + wingshape + ", colors="
				+ colors + ", features=" + features + "]";
	}
}
