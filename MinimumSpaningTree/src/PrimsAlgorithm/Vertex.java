package PrimsAlgorithm;

import java.util.List;

public class Vertex implements Comparable<Vertex> {
	String name;
	int key;
	public List<Edge> incidentEdges;
	public Vertex previous;

	public Vertex(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Vertex [name=" + name + ", key=" + key + ", previous=" + previous + "]";
	}

	@Override
	public int compareTo(Vertex o) {
		return Integer.compare(key, o.key);
	}
}
