package com.app.filters

class NativeLib {

    /**
     * A native method that is implemented by the 'filters' native library,
     * which is packaged with this application.
     */
    external fun stringFromJNI(): String

    companion object {
        // Used to load the 'filters' library on application startup.
        init {
            System.loadLibrary("filters")
        }
    }
}