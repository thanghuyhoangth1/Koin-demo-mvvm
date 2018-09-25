package randomperson.cleanarchitecture.framg.com.koin_mvvm_randomperson.base

import android.app.Application
import android.arch.lifecycle.AndroidViewModel
import android.arch.lifecycle.LifecycleObserver

abstract class BaseViewModel(application: Application) : AndroidViewModel(application), LifecycleObserver