package nhom6.example.Planta.payload;

import java.sql.Date;
import java.sql.Time;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CareCalendar {
	
	private int myScheduleId;
	private String name;
	private Date startDate;
	private Date endDate;
	private Time time;
	private int frequency;
}
