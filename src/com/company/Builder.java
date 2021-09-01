package com.company;

public class Builder {

    static class Figure {
        String theForm;
        String theFilled;
        String collor;

        public void setTheForm(String theForm) {
            this.theForm = theForm;
        }

        public void setTheFilled(String theFilled) {
            this.theFilled = theFilled;
        }

        public void setCollor(String collor) {
                this.collor = collor;
        }
        public String toString(){
            return "Figure created \nForm:\t" + theForm + "\nFill:\t" + theFilled + "\nColor:\t" + collor ;
        }
    }

    static class FigureBuilder {
        String formOfFigure = "square";
        String filledOfFigure = "not filled";
        String collorOfFigure = "black";

        FigureBuilder buildForm(String formOfFigure) {
            this.formOfFigure = formOfFigure;
            return this;
        }

        FigureBuilder buildFill(String filledOfFigure) {
            this.filledOfFigure = filledOfFigure;
            return this;
        }

        FigureBuilder buildColor(String collorOfFigure) {
            this.collorOfFigure = collorOfFigure;
            return this;
        }

        Figure build() {
            Figure figure = new Figure();
            figure.setTheForm(formOfFigure);
            figure.setTheFilled(filledOfFigure);
            figure.setCollor(collorOfFigure);
            return figure;

        }
    }
}
