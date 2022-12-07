class FootballMatch (var firstTeamScore: Int, var secondTeamScore: Int){

    fun setMatchScore(ftScore: Int, stScore: Int){
        firstTeamScore = ftScore
        secondTeamScore = stScore
    }

    override fun toString(): String {
        return "FootballMatch(firstTeamScore=$firstTeamScore, secondTeamScore=$secondTeamScore)"
    }


}