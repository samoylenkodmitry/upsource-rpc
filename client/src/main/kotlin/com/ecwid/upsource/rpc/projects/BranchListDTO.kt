package com.ecwid.upsource.rpc.projects

data class BranchListDTO(
	/**
	 * See BranchDTO parameters (repeated)
	 */
	val branch: List<BranchDTO> = emptyList(),

	/**
	 * Whether all available items have been returned or more can be requested by passing the corresponding 'limit' value in the subsequent request (required)
	 */
	val hasMore: Boolean,

	/**
	 * How many branches (required)
	 */
	val totalBranches: Int,

	/**
	 * Name of the default branch (optional)
	 */
	val defaultBranch: String? = null,

	/**
	 * Whether the project has the default branch (optional)
	 */
	val isDefaultBranchExists: Boolean? = null
) {
	internal constructor() : this(
		branch = emptyList(),
		hasMore = false,
		totalBranches = 0,
		defaultBranch = null,
		isDefaultBranchExists = null
	)
}
