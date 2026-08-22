class Solution {
    public boolean canFinish(int num, int[][] a) {

        int[] vis = new int[num];
        int[] pathVis = new int[num];

        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();

        for (int i = 0; i < num; i++) {
            adj.add(new ArrayList<>());
        }

        for (int i = 0; i < a.length; i++) {
            int x = a[i][0];
            int y = a[i][1];

            adj.get(y).add(x);
        }

        for (int i = 0; i < num; i++) {
            if (vis[i] == 0) {
                if (DFS(i, adj, vis, pathVis)) {
                    return false;
                }
            }
        }

        return true;
    }

    public boolean DFS(int node,
                       ArrayList<ArrayList<Integer>> adj,
                       int[] vis,
                       int[] pathVis) {

        vis[node] = 1;
        pathVis[node] = 1;

        for (int it : adj.get(node)) {

            if (vis[it] == 0) {
                if (DFS(it, adj, vis, pathVis)) {
                    return true;
                }
            }

            else if (pathVis[it] == 1) {
                return true; // cycle
            }
        }

        pathVis[node] = 0;

        return false;
    }
}