package com.ecwid.upsource.rpc.projects

/**
 * Describes read status of a feed item
 */
enum class ReadEnum(val value: Byte, val originalName: String) {
	READ(value = 1, originalName = "Read"),
	UNREAD(value = 2, originalName = "Unread"),
	MANUALLY_UNREAD(value = 3, originalName = "ManuallyUnread");

	companion object {
		private val MAP_BY_VALUES = values().associateBy { it.value }
		fun fromValue(value: Byte) = MAP_BY_VALUES[value]
	}
}
