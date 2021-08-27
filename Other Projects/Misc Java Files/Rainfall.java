public Rainfall{
	double [] rainfallStats;
	
	public double getTotalRainfall(){
		double totalRainfall = 0;
		
		for( int index = 0; index < rainfallStats.length; index++){
			totalRainfall = totalRainfall + rainfallStats[index];
		}
		return totalRainfall;
	
	}
	
	public double getAverageRainfall(){
		return getTotalRainfall() / rainfallStats.length;
	}
	
	public int getMostRainMonth() {
		double mostRain = rainfallStats[0]
		int mostRainMonth = 1;
		
		`for( int index = 0; index < rainfallStats.length; index++){
			if(rainfallStats[index] > mostRain){
				mostRain = rainfallStats[index];
				mostRainMonth = index + 1;
		}
	}
	return mostRainMonth;
}

	public int getLeastRainMonth() {
			double leastRain = rainfallStats[0]
			int leastRainMonth = 1;
			
			`for( int index = 0; index < rainfallStats.length; index++){
				if(rainfallStats[index] < mostRain){
					leastRain = rainfallStats[index];
					leastRainMonth = index + 1;
			}
		}
		return leastRainMonth;
}
	
	public Rainfall(double [] rainfallStatsGiven){
		rainfallStats = new double[rainfallStatsGiven.length];
		
		for(int index = 0; index < rainfallStatsGiven.length; index++){
			rainfallStats[index] = rainfallStatsGiven[index];
		}
	}


}