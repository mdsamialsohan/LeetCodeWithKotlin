fun islandPerimeter(grid: Array<IntArray>): Int {
    var island: Int = 0
    var neighbour = 0
    for(i in grid.indices)
    {
        for(j in grid[0].indices)
        {
            if(grid[i][j]==1) {
                island+=1
                if(i>=1 && grid[i-1][j]==1) neighbour+=1
                if(j>=1 && grid[i][j-1]==1) neighbour+=1
            }

        }
    }
    return island * 4 - neighbour * 2
}