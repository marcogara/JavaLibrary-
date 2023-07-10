public class BrickCreationParameters {
        private int rows;
        private int cols;
        private int brickWidth;
        private int brickHeight;
        private int startX;
        private int startY;
        private int spacing;

        public BrickCreationParameters(int rows, int cols, int brickWidth, int brickHeight, int startX, int startY, int spacing) {
            this.rows = rows;
            this.cols = cols;
            this.brickWidth = brickWidth;
            this.brickHeight = brickHeight;
            this.startX = startX;
            this.startY = startY;
            this.spacing = spacing;
        }

        public int getRows() {
            return rows;
        }

        public int getCols() {
            return cols;
        }

        public int getBrickWidth() {
            return brickWidth;
        }

        public int getBrickHeight() {
            return brickHeight;
        }

        public int getStartX() {
            return startX;
        }

        public int getStartY() {
            return startY;
        }

        public int getSpacing() {
            return spacing;
        }
    }


