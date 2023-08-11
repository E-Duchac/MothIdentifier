package com.example.moths.model;

import java.util.ArrayList;

import org.springframework.data.annotation.Id;

import com.example.moths.enums.*;

public class Moth {
    @Id
    private String id;
	private String casualName;
	private String scientificName;
	private Antennae antennae;
	private ArrayList<Pattern> patterns;
	private Wingshape wingshape;
	private ArrayList<Color> colors;	
	private ExtraFeatures features;
	
	public Moth() {
		super();
	}
	
	public Moth(String casualName) {
		this.casualName = casualName;
	}

	public String getCasualName() {
		return casualName;
	}

	public void setCasualName(String casualName) {
		this.casualName = casualName;
	}

	public String getScientificName() {
		return scientificName;
	}

	public void setScientificName(String scientificName) {
		this.scientificName = scientificName;
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
		result = prime * result + ((casualName == null) ? 0 : casualName.hashCode());
		result = prime * result + ((colors == null) ? 0 : colors.hashCode());
		result = prime * result + ((features == null) ? 0 : features.hashCode());
		result = prime * result + ((patterns == null) ? 0 : patterns.hashCode());
		result = prime * result + ((scientificName == null) ? 0 : scientificName.hashCode());
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
		Moth other = (Moth) obj;
		if (antennae != other.antennae)
			return false;
		if (casualName == null) {
			if (other.casualName != null)
				return false;
		} else if (!casualName.equals(other.casualName))
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
		if (scientificName == null) {
			if (other.scientificName != null)
				return false;
		} else if (!scientificName.equals(other.scientificName))
			return false;
		if (wingshape != other.wingshape)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Moth [casualName=" + casualName + ", scientificName=" + scientificName + ", antennae=" + antennae
				+ ", patterns=" + patterns + ", wingshape=" + wingshape + ", colors=" + colors + ", features="
				+ features + "]";
	}
}