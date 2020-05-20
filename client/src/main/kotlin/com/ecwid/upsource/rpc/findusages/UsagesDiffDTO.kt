package com.ecwid.upsource.rpc.findusages

data class UsagesDiffDTO(
	/**
	 * See FilePathToRootDTO parameters (optional)
	 */
	val oldFilePathToRoot: FilePathToRootDTO? = null,

	/**
	 * See FilePathToRootDTO parameters (optional)
	 */
	val newFilePathToRoot: FilePathToRootDTO? = null,

	/**
	 * See FindUsagesItemDTO parameters (repeated)
	 */
	val removedUsage: List<FindUsagesItemDTO> = emptyList(),

	/**
	 * See SameUsagesDTO parameters (repeated)
	 */
	val sameUsage: List<SameUsagesDTO> = emptyList(),

	/**
	 * See FindUsagesItemDTO parameters (repeated)
	 */
	val addedUsage: List<FindUsagesItemDTO> = emptyList()
)