package com.manikarthi25.java8.datetime;

import java.time.Clock;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class ZonedDateTimeExample {

	public static void main(String[] args) {
		
		ZonedDateTime zonedDateTime = ZonedDateTime.now();
		System.out.println("zonedDateTime :" + zonedDateTime); // 2020-10-03T17:10:42.248927200+05:30[Asia/Calcutta]
		System.out.println("getOffset :" + zonedDateTime.getOffset()); // +05:30
		System.out.println("getZone : " + zonedDateTime.getZone()); // Asia/Calcutta
		
		System.out.println("getAvailableZoneIds :" + ZoneId.getAvailableZoneIds()); // Display all zone ids
		ZoneId.getAvailableZoneIds().stream().sorted().forEach((zone) -> System.out.println(zone)); // Display all zone ids
		int totalZoneIdSize = ZoneId.getAvailableZoneIds().size();
		System.out.println("Total number of zone ids : " +totalZoneIdSize); // 601
		
		//CST. EST, MST. PST - Four time zone in america
		System.out.println("CST :" +ZonedDateTime.now(ZoneId.of("America/Chicago")));
		System.out.println("EST :" +ZonedDateTime.now(ZoneId.of("America/Detroit")));
		System.out.println("PST :" +ZonedDateTime.now(ZoneId.of("America/Los_Angeles")));
		System.out.println("MST :" +ZonedDateTime.now(ZoneId.of("America/Denver")));
		
		// Compare
		System.out.println("ZonedDateTime.now(ZoneId.of              :" +ZonedDateTime.now(ZoneId.of("America/Chicago")));
		System.out.println("ZonedDateTime.now(Clock.system(ZoneId.of :" +ZonedDateTime.now(Clock.system(ZoneId.of("America/Chicago"))));
		LocalDateTime localDateTimeId = LocalDateTime.now(ZoneId.of("America/Chicago"));
		System.out.println("LocalDateTime.now(ZoneId.of(             :" + localDateTimeId);
		System.out.println("LocalDateTime.ofInstant(Instant.now()    :" + LocalDateTime.ofInstant(Instant.now(), ZoneId.of("America/Chicago")));
		System.out.println("Local System Current Date and Time       :" + LocalDateTime.now());
		
		
		

	}

}
