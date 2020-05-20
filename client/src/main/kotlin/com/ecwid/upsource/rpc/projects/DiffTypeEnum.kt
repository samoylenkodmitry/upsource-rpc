package com.ecwid.upsource.rpc.projects

/**
 * Describes file-level diff type
 */
enum class DiffTypeEnum(val value: Byte, val originalName: String) {
	ADDED(value = 1, originalName = "Added"),
	REMOVED(value = 2, originalName = "Removed"),
	MODIFIED(value = 3, originalName = "Modified"),
	COMMENTED(value = 4, originalName = "Commented");

	companion object {
		private val MAP_BY_VALUES = values().associateBy { it.value }
		fun fromValue(value: Byte) = MAP_BY_VALUES[value]
	}
}
