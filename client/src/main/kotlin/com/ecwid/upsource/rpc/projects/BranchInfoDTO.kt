// Generated by the codegen. Please DO NOT EDIT!
// source: message.ftl

package com.ecwid.upsource.rpc.projects

/**
 * @param commitsCount Number of commits associated with the branch
 * @param filesCount Number of files affected by the branch commits
 * @param branchingRevision Revision where the branching took place
 * @param headRevision Latest revision in the branch. See RevisionInfoDTO parameters
 * @param reviewInfo See ReviewDescriptorDTO parameters
 * @param canCreateReview A branch review can be created. See CanCreateBranchReviewDTO parameters.
 * @param stats See BranchStatsDTO parameters
 * @param mergeInfo See BranchMergeInfoDTO parameters
 * @param isPullRequest Whether the branch is a pull request
 */
@Suppress("unused")
data class BranchInfoDTO(
	/**
	 * Number of commits associated with the branch (required)
	 */
	val commitsCount: Int,

	/**
	 * Number of files affected by the branch commits (required)
	 */
	val filesCount: Int,

	/**
	 * Revision where the branching took place (required)
	 */
	val branchingRevision: String,

	/**
	 * Latest revision in the branch. See RevisionInfoDTO parameters (required)
	 * 
	 * @see com.ecwid.upsource.rpc.projects.RevisionInfoDTO
	 */
	val headRevision: RevisionInfoDTO,

	/**
	 * See ReviewDescriptorDTO parameters (optional)
	 * 
	 * @see com.ecwid.upsource.rpc.projects.ReviewDescriptorDTO
	 */
	val reviewInfo: ReviewDescriptorDTO? = null,

	/**
	 * A branch review can be created. See CanCreateBranchReviewDTO parameters. (required)
	 * 
	 * @see com.ecwid.upsource.rpc.projects.CanCreateBranchReviewDTO
	 */
	val canCreateReview: CanCreateBranchReviewDTO,

	/**
	 * See BranchStatsDTO parameters (required)
	 * 
	 * @see com.ecwid.upsource.rpc.projects.BranchStatsDTO
	 */
	val stats: BranchStatsDTO,

	/**
	 * See BranchMergeInfoDTO parameters (required)
	 * 
	 * @see com.ecwid.upsource.rpc.projects.BranchMergeInfoDTO
	 */
	val mergeInfo: BranchMergeInfoDTO,

	/**
	 * Whether the branch is a pull request (required)
	 */
	val isPullRequest: Boolean
) {
	@Suppress("unused")
	internal constructor() : this(
		commitsCount = 0,
		filesCount = 0,
		branchingRevision = "",
		headRevision = RevisionInfoDTO(),
		reviewInfo = null,
		canCreateReview = CanCreateBranchReviewDTO(),
		stats = BranchStatsDTO(),
		mergeInfo = BranchMergeInfoDTO(),
		isPullRequest = false
	)
}
