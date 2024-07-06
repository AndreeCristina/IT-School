package session_5_advanced_flow_control.challenge;


public class Exercise13 {
    public static char OPEN_CELL = '0';
    public static char WALL = '1';
    public static char START = 'S';
    public static char END = 'E';
    public static char PATH = '*';

    public static void main(String[] args) {
        char[][] maze = {
                {'S', '1', '0', '1'},
                {'0', '1', '0', '1'},
                {'0', '1', '0', '1'},
                {'1', '0', '0', 'E'}
        };

        int rows = maze.length;
        int cols = maze[0].length;

        int startRow = -1;
        int startCol = -1;
        int endRow = -1;
        int endCol = -1;

        // Find start and end positions
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (maze[i][j] == 'S') {
                    startRow = i;
                    startCol = j;
                } else if (maze[i][j] == 'E') {
                    endRow = i;
                    endCol = j;
                }
            }
        }
    }
}
