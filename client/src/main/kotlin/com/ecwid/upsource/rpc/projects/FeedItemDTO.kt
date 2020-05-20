package com.ecwid.upsource.rpc.projects

data class FeedItemDTO(
	/**
	 * News feed item ID (required)
	 */
	val feedItemId: String,

	/**
	 * Project ID in Upsource (required)
	 */
	val projectId: String,

	/**
	 * See DiscussionInFeedDTO parameters (optional)
	 */
	val discussion: DiscussionInFeedDTO? = null,

	/**
	 * See RevisionInfoDTO parameters (repeated)
	 */
	val addedRevisions: List<RevisionInfoDTO> = emptyList(),

	/**
	 * See RevisionInfoDTO parameters (repeated)
	 */
	val removedRevisions: List<RevisionInfoDTO> = emptyList(),

	/**
	 * See ParticipantInReviewDTO parameters (optional)
	 */
	val newParticipantInReview: ParticipantInReviewDTO? = null,

	/**
	 * Show removed participants (optional)
	 */
	val removedParticipantFromReview: String? = null,

	/**
	 * See ParticipantStateChangedDTO parameters (optional)
	 */
	val participantStateChanged: ParticipantStateChangedDTO? = null,

	/**
	 * See ShortReviewInfoDTO parameters (optional)
	 */
	val createdReview: ShortReviewInfoDTO? = null,

	/**
	 * See ShortReviewInfoDTO parameters (optional)
	 */
	val modifiedReview: ShortReviewInfoDTO? = null,

	/**
	 * See ReviewIdDTO parameters (optional)
	 */
	val removedReview: com.ecwid.upsource.rpc.ids.ReviewIdDTO? = null,

	/**
	 * See ReviewStateChangedDTO parameters (optional)
	 */
	val reviewStateChanged: ReviewStateChangedDTO? = null,

	/**
	 * The branch name for the "Review stopped branch tracking" feed event (optional)
	 */
	val branchTrackingStopped: String? = null,

	val updatedDeadline: Long? = null,

	/**
	 * Whether the feed item relates to the pull request action (optional)
	 */
	val pullRequest: String? = null,

	/**
	 * Unix timestamp (required)
	 */
	val date: Long,

	/**
	 * The ID of the user who performed the feed action (required)
	 */
	val actorId: String,

	/**
	 * Indicates that a review was squashed to a single revision (optional)
	 */
	val squashedToRevision: RevisionInfoDTO? = null,

	/**
	 * Indicates that a discussion was removed (optional)
	 */
	val removedDiscussionId: String? = null
) {
	internal constructor() : this(
		feedItemId = "",
		projectId = "",
		discussion = null,
		addedRevisions = emptyList(),
		removedRevisions = emptyList(),
		newParticipantInReview = null,
		removedParticipantFromReview = null,
		participantStateChanged = null,
		createdReview = null,
		modifiedReview = null,
		removedReview = null,
		reviewStateChanged = null,
		branchTrackingStopped = null,
		updatedDeadline = null,
		pullRequest = null,
		date = 0L,
		actorId = "",
		squashedToRevision = null,
		removedDiscussionId = null
	)
}
