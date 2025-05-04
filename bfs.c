#include <stdio.h>
#include <stdlib.h>
#define MAX 100

int adj[MAX][MAX]; // Adjacency matrix
int visited[MAX];
int queue[MAX];
int front = -1, rear = -1;
int n; // Number of vertices

// Function to enqueue
void enqueue(int vertex) {
    if (rear == MAX - 1)
        printf("Queue Overflow\n");
    else {
        if (front == -1)
            front = 0;
        queue[++rear] = vertex;
    }
}

// Function to dequeue
int dequeue() {
    int vertex;
    if (front == -1)
        printf("Queue Underflow\n");
    else {
        vertex = queue[front++];
        if (front > rear)
            front = rear = -1;
    }
    return vertex;
}

// BFS function
void BFS(int start) {
    enqueue(start);
    visited[start] = 1;

    while (front != -1) {
        int vertex = dequeue();
        printf("%d ", vertex);

        // Explore all adjacent vertices
        for (int i = 0; i < n; i++) {
            if (adj[vertex][i] && !visited[i]) {
                enqueue(i);
                visited[i] = 1;
            }
        }
    }
}

int main() {
    int edges, src, dest, start;

    printf("Enter number of vertices: ");
    scanf("%d", &n);

    printf("Enter number of edges: ");
    scanf("%d", &edges);

    // Initialize adjacency matrix to 0
    for (int i = 0; i < n; i++)
        for (int j = 0; j < n; j++)
            adj[i][j] = 0;

    // Input edges
    printf("Enter %d edges (source destination):\n", edges);
    for (int i = 0; i < edges; i++) {
        scanf("%d%d", &src, &dest);
        adj[src][dest] = 1;
        adj[dest][src] = 1; // For undirected graph
    }

    printf("Enter starting vertex for BFS: ");
    scanf("%d", &start);

    printf("BFS traversal: ");
    BFS(start);

    return 0;
}


Enter number of vertices: 5
Enter number of edges: 4
Enter 4 edges (source destination):
0 1
0 2
1 3
1 4
Enter starting vertex for BFS: 0
BFS traversal: 0 1 2 3 4