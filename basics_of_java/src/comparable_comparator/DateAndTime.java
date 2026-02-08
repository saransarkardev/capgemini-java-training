package comparable_comparator;

import java.util.*;

public class DateAndTime {
	public static List<List<String>> extractErrorLogs(List<List<String>> logs) {
		
		List<List<String>> result = new ArrayList<>();
		
		for (int i=0; i<logs.size(); i++) {
			if (logs.get(i).get(2) == "ERROR" || logs.get(i).get(2) == "CRITICAL") {
				result.add(logs.get(i));
			}
		}
		
		Collections.sort(result, (a , b) -> {
			String date1 = a.get(0);
			String time1 = a.get(1);
			
			String[] date1Array = date1.split("-");
			String final1 = date1Array[2] + date1Array[1] + date1Array[0] 
					+ time1.replace(":", "");
			
			String date2 = b.get(0);
			String time2 = b.get(1);
			
			String[] date2Array = date2.split("-");
			String final2 = date2Array[2] + date2Array[1] + date2Array[0] 
					+ time2.replace(":", "");
			
			// ascending order
			return final1.compareTo(final2);
			 
		});
		
		return result;
	}
	public static void main(String[] args) {
		List<List<String>> logs = new ArrayList<>();
		
		logs.add(Arrays.asList("02-01-2023", "10:00", "ERROR", "failed"));
        logs.add(Arrays.asList("01-01-2023", "14:00", "INFO", "ok"));
        logs.add(Arrays.asList("31-12-2022", "23:00", "CRITICAL", "failed"));
        logs.add(Arrays.asList("01-01-2023", "01:30", "ERROR", "timeout"));

        List<List<String>> result = extractErrorLogs(logs);
        
        System.out.println(result);
	}
}
