package com.kgmyshin.workDictionary.domain.work.episode

import com.kgmyshin.workDictionary.domain.work.WorkId
import io.reactivex.Maybe
import io.reactivex.Single

internal interface EpisodeRepository {

    fun findById(id: EpisodeId): Maybe<Episode>

    fun findAllByWorkId(workId: WorkId): Single<List<Episode>>


}