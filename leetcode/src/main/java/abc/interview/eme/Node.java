package abc.interview.eme;

import java.util.ArrayList;

import abc.interview.graphgood.Edge;
public class Node {
	private int distanceFromSource = Integer.MAX_VALUE;
	private boolean visited;
	private ArrayList<Edge> edges = new ArrayList<Edge>(); // now we must create edges
	public int getDistanceFromSource() {
		return distanceFromSource;
	}
	public void setDistanceFromSource(int distanceFromSource) {
		this.distanceFromSource = distanceFromSource;
	}
	public boolean isVisited() {
		return visited;
	}
	public void setVisited(boolean visited) {
		this.visited = visited;
	}
	public ArrayList<Edge> getEdges() {
		return edges;
	}
	public void setEdges(ArrayList<Edge> edges) {
		this.edges = edges;
	}
}
