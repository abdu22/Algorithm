package PrimsAlgorithm;

public class Edge {

	int weight;
	Vertex end;

	public Edge(Vertex end, int weight) {
		this.weight = weight;
		this.end = end;

	}

	@Override
	public String toString() {
		return "Edge [weight=" + weight + ", end=" + end + "]";
	}
}
