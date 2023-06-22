package com.manikarthi25.java8.datetime;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.OffsetDateTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;

public class ConvertLocalDateTimeToZonedDateTime {

	public static void main(String[] args) {
		
		// Convert LocalDateTime to ZonedDateTime
		LocalDateTime localDateTimeWithoutZone = LocalDateTime.now();
		System.out.println("localDateTime with out zone  :" + localDateTimeWithoutZone);
		
		ZonedDateTime zonedDateTimeimeLocal = localDateTimeWithoutZone.atZone(ZoneId.of("America/Chicago"));
		System.out.println("localDateTime with zone      :" + zonedDateTimeimeLocal);
		
		Instant inatant  = Instant.now();		
		ZonedDateTime zonedDateTimeimeInstant = inatant.atZone(ZoneId.of("America/Chicago"));
		System.out.println("Instant with zone            :" + zonedDateTimeimeInstant);
		
		OffsetDateTime localDateTimeOffset = LocalDateTime.now().atOffset(ZoneOffset.ofHours(-6));
		System.out.println("Add offset with LocalDateTime :" + localDateTimeOffset);

	}

}
