package cn.xpbootcamp.refactor;

class RentalItem {

    private Movie movie;
    private int daysRented;

    RentalItem(int movieId, int daysRented) {
        this.movie = MovieLibrary.getMoveById(movieId);
        this.daysRented = daysRented;
    }

    Movie getMovie() {
        return movie;
    }

    int getDaysRented() {
        return daysRented;
    }

    double getRentPrice(){
        double thisAmount = 0d;
        switch (this.movie.getMovieType()) {
            case HISTORY:
                thisAmount += 2;
                if (this.daysRented > 2)
                    thisAmount += (this.daysRented - 2) * 1.5;
                break;
            case NEW_RELEASE:
                thisAmount += this.daysRented * 3;
                break;
            case CAMPUS:
                thisAmount += 1.5;
                if (this.daysRented > 3)
                    thisAmount += (this.daysRented - 3) * 1.5;
                break;
        }
        return thisAmount;
    }

    int getRentCredit(){
        int credit = 1;
        if ((this.movie.getMovieType() == MovieType.NEW_RELEASE) && this.daysRented > 1){
            credit++;
        }
        return credit;
    }
}
