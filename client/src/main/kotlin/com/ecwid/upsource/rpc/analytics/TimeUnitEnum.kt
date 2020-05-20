package com.ecwid.upsource.rpc.analytics

enum class TimeUnitEnum(val value: Byte, val originalName: String) {
	HOUR(value = 1, originalName = "HOUR"),
	DAY(value = 2, originalName = "DAY"),
	WEEK(value = 3, originalName = "WEEK"),
	MONTH(value = 4, originalName = "MONTH"),
	QUARTER(value = 5, originalName = "QUARTER"),
	YEAR(value = 6, originalName = "YEAR");

	companion object {
		private val MAP_BY_VALUES = values().associateBy { it.value }
		fun fromValue(value: Byte) = MAP_BY_VALUES[value]
	}
}
