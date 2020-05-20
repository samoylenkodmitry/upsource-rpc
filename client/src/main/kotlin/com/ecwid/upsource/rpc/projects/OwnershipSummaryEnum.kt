package com.ecwid.upsource.rpc.projects

/**
 * Describes file ownership
 */
enum class OwnershipSummaryEnum(val value: Byte, val originalName: String) {
	OK(value = 1, originalName = "OK"),
	ONE_MAJOR(value = 2, originalName = "ONE_MAJOR"),
	ALL_MINOR(value = 3, originalName = "ALL_MINOR");

	companion object {
		private val MAP_BY_VALUES = values().associateBy { it.value }
		fun fromValue(value: Byte) = MAP_BY_VALUES[value]
	}
}
