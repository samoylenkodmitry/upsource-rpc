package com.ecwid.upsource.rpc.projects

/**
 * Describes project status
 */
enum class ProjectStateEnum(val value: Byte, val originalName: String) {
	NOT_STARTED(value = 1, originalName = "NotStarted"),
	INITIALIZING(value = 2, originalName = "Initializing"),
	SUCCESS(value = 3, originalName = "Success"),
	FAILURE(value = 4, originalName = "Failure");

	companion object {
		private val MAP_BY_VALUES = values().associateBy { it.value }
		fun fromValue(value: Byte) = MAP_BY_VALUES[value]
	}
}
