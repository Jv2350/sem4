# write a program for checking whether a given graph G has simple path from source s to destination d. Assume the graph G is represented using adjacent matrix
from collections import defaultdict


class Graph:
    def __init__(self, vertices):
        self.V = vertices
        self.graph = defaultdict(list)

    def addEdge(self, u, v):
        self.graph[u].append(v)

    def isReachable(self, s, d):
        visited = [False] * self.V
        queue = [s]
        visited[s] = True
        while queue:
            n = queue.pop(0)
            if n == d:
                return True
            for i in self.graph[n]:
                if not visited[i]:
                    queue.append(i)
                    visited[i] = True
            return False


g = Graph(4)
edges = [(0, 1), (0, 2), (1, 2), (2, 0), (2, 3), (3, 3)]
for u, v in edges:
    g.addEdge(u, v)

pairs = [(2, 1), (1, 1)]
for u, v in pairs:
    if g.isReachable(u, v):
        print(f"There is a path from {u} to {v}")
    else:
        print(f"There is no path from {u} to {v}")

# ----------------------------------------------------------------


class Graph:

    def __init__(self, vertices):
        self.V = vertices  # No. of vertices
        self.graph = defaultdict(list)  # default dictionary to store graph

    def addEdge(self, u, v):
        self.graph[u].append(v)

    def isReachable(self, s, d):
        visited = [False] * (self.V)
        queue = []
        queue.append(s)
        visited[s] = True
        while queue:
            n = queue.pop(0)
            if n == d:
                return True
            for i in self.graph[n]:
                if visited[i] == False:
                    queue.append(i)
                    visited[i] = True
            return False  # imp indentation


g = Graph(4)
g.addEdge(0, 1)
g.addEdge(0, 2)
g.addEdge(1, 2)
g.addEdge(2, 0)
g.addEdge(2, 3)
g.addEdge(3, 3)

u = 2
v = 1
if g.isReachable(u, v):
    print("There is a path from %d to %d" % (u, v))
else:
    print("There is no path from %d to %d" % (u, v))

u = 1
v = 1
if g.isReachable(u, v):
    print("There is a path from %d to %d" % (u, v))
else:
    print("There is no path from %d to %d" % (u, v))
