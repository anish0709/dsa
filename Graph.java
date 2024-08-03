package com.dsa;

import java.util.*;
import java.util.LinkedList;
import java.util.Scanner;

public class Graph {

	public static void main(String[] args) {
		ArrayList<Edge> graph[] = createGraph(6);

		for (ArrayList<Edge> edges : graph) {
			edges.stream().forEach(edge -> System.out.println(edge));
		}

//		bfs(graph);
//		dfs(graph);
//		allPathToDest(graph, 0, 5);
		
		djkstra(graph, 0);
	}

	public static void allPathToDest(ArrayList<Edge>[] graph, int src, int dest) {
		int v = graph.length;
		allPathToDest(graph, new boolean[v], src, dest, "");
	}

	private static void allPathToDest(ArrayList<Edge> graph[], boolean visited[], int curr, int tar, String path) {
		if (curr == tar) {
			System.out.println(path);
			return;
		}

		for (int i = 0; i < graph[curr].size(); i++) {
			int next = graph[curr].get(i).dest;
			if (visited[next] == false) {
				visited[curr] = true;
				allPathToDest(graph, visited, next, tar, path + curr);
				visited[curr] = false;
			}
		}
	}

	public static void dfs(ArrayList<Edge> graph[]) {
		boolean visited[] = new boolean[graph.length];
		for (int i = 0; i < graph.length; i++) {
			if (visited[i] == false) {
				dfs(graph, i, visited);
			}
		}
	}

	private static void dfs(ArrayList<Edge>[] graph, int curr, boolean visited[]) {
		System.out.print(curr + " ");
		visited[curr] = true;
		for (int i = 0; i < graph[curr].size(); i++) {
			int next = graph[curr].get(i).dest;
			if (visited[next] == false) {
				dfs(graph, next, visited);
			}
		}
	}

	public static void bfs(ArrayList<Edge> graph[]) {
		int v = graph.length;
		boolean visited[] = new boolean[v];

		java.util.Queue<Integer> q = new LinkedList<Integer>();
		q.offer(0);
		while (!q.isEmpty()) {
			int curr = q.poll();
			if (visited[curr] == false) {
				System.out.print(curr + " ");
				visited[curr] = true;

				for (int i = 0; i < graph[curr].size(); i++) {
					int vertex = graph[curr].get(i).dest;
					q.add(vertex);
				}
			}
		}

	}

	public static ArrayList<Edge>[] createGraph(int v) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Edge>[] graph = new ArrayList[v];

		for (int i = 0; i < v; i++) {
			graph[i] = new ArrayList<Edge>();
		}

		for (int i = 0; i < v; i++) {
			boolean value = false;
			System.out.println("There is neighbor of edge " + i);
			value = sc.nextBoolean();
			while (value) {
				System.out.println("Enter the neighbor of " + i);
				int dest = sc.nextInt();
				System.out.println("Enter the weight of " + i);
				int wt = sc.nextInt();
				graph[i].add(new Edge(i, dest, wt));
				System.out.println("There is neighbor of edge " + i);
				value = sc.nextBoolean();
			}
		}

		return graph;
	}

	public static void djkstra(ArrayList<Edge> graph[],int src) {
		PriorityQueue<Pair> pq = new PriorityQueue<Pair>();
		int V = graph.length;
		int dist[] = new int[V];
		for(int i=0;i<V;i++) {
			if(i!=src) {
				dist[i] =Integer.MAX_VALUE;
			}
			
		}
		boolean visited[] = new boolean[V];
		pq.add(new Pair(src,0));
		while(!pq.isEmpty()) {
			Pair curr = pq.remove();
			
			if(!visited[curr.node]) {
				visited[curr.node] = true;
				
				for(int i=0;i<graph[curr.node].size();i++) {
					Edge e = graph[curr.node].get(i);
					int u = e.src;
					int v = e.dest;
					if(dist[u]+e.wt<dist[v]) {
						dist[v] = dist[u] + e.wt;
						pq.add(new Pair(v,dist[v]));
					}
				}
			}
		}
		
		for(int i=0;i<V;i++) {
			System.out.println("dist from "+src+" to "+i+" : "+dist[i]);
		}
	}
}

class Pair implements Comparable<Pair> {
	int node;
	int dist;

	public Pair(int node, int dist) {
		this.node = node;
		this.dist = dist;
	}

	@Override
	public int compareTo(Pair p2) {
		return this.dist - p2.dist;
	}

}

class Edge {

	int src;
	int dest;
	int wt;

	public Edge(int src, int dest) {
		this.src = src;
		this.dest = dest;
	}

	public Edge(int src, int dest, int wt) {
		this.src = src;
		this.dest = dest;
		this.wt = wt;
	}

	@Override
	public String toString() {
		return "Edge [src=" + src + ", dest=" + dest + ", weight=" + wt + "]";
	}

}