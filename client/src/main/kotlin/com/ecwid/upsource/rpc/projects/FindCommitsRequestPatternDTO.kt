package com.ecwid.upsource.rpc.projects

data class FindCommitsRequestPatternDTO(
	/**
	 * VCS revision ID (optional)
	 */
	val revisionId: String? = null,

	/**
	 * Project ID in Upsource (optional)
	 */
	val projectId: String? = null,

	/**
	 * A fragment of the commit message used as a search query (optional)
	 */
	val messageFragment: String? = null,

	/**
	 * Name of the commit author (optional)
	 */
	val author: String? = null,

	/**
	 * Unix timestamp of the commit (optional)
	 */
	val commitTime: Long? = null
)