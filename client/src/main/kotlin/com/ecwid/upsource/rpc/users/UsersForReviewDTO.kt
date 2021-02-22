// Generated by the codegen. Please DO NOT EDIT!
// source: message.ftl

package com.ecwid.upsource.rpc.users

/**
 * @param result Suggested reviewers for a given review
 * @param relevantUser All relevant users
 * @param userRelevance Users' relevance [0..100]
 */
@Suppress("unused")
data class UsersForReviewDTO(
	/**
	 * Suggested reviewers for a given review (required)
	 */
	val result: UsersListDTO,

	/**
	 * All relevant users (repeated)
	 */
	val relevantUser: List<String> = emptyList(),

	/**
	 * Users' relevance [0..100] (repeated)
	 */
	val userRelevance: List<Int> = emptyList()
) {
	@Suppress("unused")
	internal constructor() : this(
		result = UsersListDTO(),
		relevantUser = emptyList(),
		userRelevance = emptyList()
	)
}

