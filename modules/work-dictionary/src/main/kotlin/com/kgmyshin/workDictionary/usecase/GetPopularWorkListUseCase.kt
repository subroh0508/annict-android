package com.kgmyshin.workDictionary.usecase

import com.kgmyshin.workDictionary.domain.work.Work
import io.reactivex.Single

internal interface GetPopularWorkListUseCase {

    fun execute(): Single<List<Work>>

}