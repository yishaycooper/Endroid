package com.yishay.endroid.model

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize


@Parcelize
data class Examples(var xml: String, var kotlin: String, var uri: String) : Parcelable {

    object Supplier {

        val examples = listOf(
            Examples("// build.gradle ViewModel dependency\n" +
                    "    implementation \"androidx.lifecycle:lifecycle-viewmodel-ktx:2.2.0\"  \n" +
                    "    \n" +
                    "    \n" +
                    "    // activity_maim.xml\n" +
                    "<?xml version=\"1.0\" encoding=\"utf-8\"?>\n" +
                    "<LinearLayout xmlns:android=\"http://schemas.android.com/apk/res/android\"\n" +
                    "    android:layout_width=\"match_parent\"\n" +
                    "    android:layout_height=\"match_parent\"\n" +
                    "    android:gravity=\"center_vertical\">\n" +
                    "    \n" +
                    "    <TextView\n" +
                    "        android:id=\"@+id/textView\"\n" +
                    "        android:layout_width=\"200dp\"\n" +
                    "        android:layout_height=\"50dp\"\n" +
                    "        android:gravity=\"center_horizontal\"\n" +
                    "        android:layout_weight=\"1\"\n" +
                    "        android:textSize=\"40sp\"\n" +
                    "        android:text=\"TextView\" />\n" +
                    "    \n" +
                    "</LinearLayout>",
                "import androidx.appcompat.app.AppCompatActivity\n" +
                        "import android.os.Bundle\n" +
                        "import android.widget.TextView\n" +
                        "import androidx.lifecycle.ViewModelProvider\n" +
                        "\n" +
                        "// implement ViewModel in MainActivity's onCreate() method\n" +
                        "class MainActivity : AppCompatActivity() {\n" +
                        "\n" +
                        "    override fun onCreate(savedInstanceState: Bundle?) {\n" +
                        "        super.onCreate(savedInstanceState)\n" +
                        "        setContentView(R.layout.activity_main)\n" +
                        "\n" +
                        "        val model = ViewModelProvider(this).get(TextGenerator::class.java)\n" +
                        "        var generatedText = model.generateText()\n" +
                        "\n" +
                        "\n" +
                        "        val textView: TextView = findViewById(R.id.textView) as TextView\n" +
                        "        textView.text = generatedText\n" +
                        "\n" +
                        "    }\n" +
                        "\n" +
                        "}\n" +
                        "\n" +
                        "import androidx.appcompat.app.AppCompatActivity\n" +
                        "import android.os.Bundle\n" +
                        "import android.widget.TextView\n" +
                        "import androidx.lifecycle.ViewModelProvider\n" +
                        "\n" +
                        "// implement ViewModel in MainActivity's onCreate() method\n" +
                        "class MainActivity : AppCompatActivity() {\n" +
                        "\n" +
                        "    override fun onCreate(savedInstanceState: Bundle?) {\n" +
                        "        super.onCreate(savedInstanceState)\n" +
                        "        setContentView(R.layout.activity_main)\n" +
                        "\n" +
                        "        val model = ViewModelProvider(this).get(TextGenerator::class.java)\n" +
                        "        var generatedText = model.generateText()\n" +
                        "\n" +
                        "\n" +
                        "        val textView: TextView = findViewById(R.id.textView) as TextView\n" +
                        "        textView.text = generatedText\n" +
                        "\n" +
                        "    }\n" +
                        "\n" +
                        "}\n",
                "kyedtT_CGLk"),
            Examples("// build.gradle\n" +
                    "<uses-permission android:name=\"android.permission.INTERNET\" />\n" +
                    "\n" +
                    "\n" +
                    "// activity_main.xml\n" +
                    "<?xml version=\"1.0\" encoding=\"utf-8\"?>\n" +
                    "<androidx.constraintlayout.widget.ConstraintLayout \n" +
                    "    xmlns:android=\"http://schemas.android.com/apk/res/android\"\n" +
                    "    xmlns:app=\"http://schemas.android.com/apk/res-auto\"\n" +
                    "    xmlns:tools=\"http://schemas.android.com/tools\"\n" +
                    "    android:layout_width=\"match_parent\"\n" +
                    "    android:layout_height=\"match_parent\"\n" +
                    "    tools:context=\".MainActivity\">\n" +
                    "\n" +
                    "    <WebView\n" +
                    "        android:id=\"@+id/web_view\"\n" +
                    "        android:layout_width=\"match_parent\"\n" +
                    "        android:layout_height=\"match_parent\"\n" +
                    "        app:layout_constraintEnd_toEndOf=\"parent\"\n" +
                    "        app:layout_constraintStart_toStartOf=\"parent\"\n" +
                    "        tools:layout_editor_absoluteY=\"0dp\" />\n" +
                    "\n" +
                    "</androidx.constraintlayout.widget.ConstraintLayout>",
                "import androidx.appcompat.app.AppCompatActivity\n" +
                        "import android.os.Bundle\n" +
                        "import android.webkit.WebView\n" +
                        "\n" +
                        "class MainActivity : AppCompatActivity() {\n" +
                        "\n" +
                        "    override fun onCreate(savedInstanceState: Bundle?) {\n" +
                        "        super.onCreate(savedInstanceState)\n" +
                        "        setContentView(R.layout.activity_main)\n" +
                        "\n" +
                        "// add webview\n" +
                        "        val myWebView: WebView = findViewById(R.id.web_view)\n" +
                        "        myWebView.settings.javaScriptEnabled = true\n" +
                        "        myWebView.settings.javaScriptCanOpenWindowsAutomatically = true\n" +
                        "        myWebView.settings.domStorageEnabled = true\n" +
                        "        myWebView.loadUrl(\"https://developer.android.com/guide\")\n" +
                        "\n" +
                        "    }\n" +
                        "\n" +
                        "    // Override onBackPressed() so as not to exit app on every back press of button.\n" +
                        "    override fun onBackPressed() {\n" +
                        "        val myWebView: WebView = findViewById(R.id.web_view)\n" +
                        "        if (myWebView.canGoBack()) {\n" +
                        "            myWebView.goBack()\n" +
                        "        } else {\n" +
                        "            super.onBackPressed()\n" +
                        "        }\n" +
                        "    }\n" +
                        "}", "SmLlLGjuuvU"),
            Examples("// manifest\n" +
                    "<uses-permission android:name=\"android.permission.INTERNET\" />\n" +
                    "\n" +
                    "// build.gradle\n" +
                    "implementation files('libs/YouTubeAndroidPlayerApi.jar')\n" +
                    "\n" +
                    "// activity_main.xml\n" +
                    "<?xml version=\"1.0\" encoding=\"utf-8\"?>\n" +
                    "<androidx.constraintlayout.widget.ConstraintLayout\n" +
                    "    xmlns:android=\"http://schemas.android.com/apk/res/android\"\n" +
                    "    xmlns:app=\"http://schemas.android.com/apk/res-auto\"\n" +
                    "    xmlns:tools=\"http://schemas.android.com/tools\"\n" +
                    "    android:layout_width=\"match_parent\"\n" +
                    "    android:layout_height=\"match_parent\"\n" +
                    "    tools:context=\".MainActivity\">\n" +
                    "\n" +
                    "    <fragment\n" +
                    "        android:id=\"@+id/yt_pf\"\n" +
                    "        android:name=\"com.google.android.youtube.player.YouTubePlayerSupportFragment\"\n" +
                    "        android:layout_width=\"match_parent\"\n" +
                    "        android:layout_height=\"wrap_content\"\n" +
                    "        app:layout_constraintLeft_toLeftOf=\"parent\"\n" +
                    "        app:layout_constraintRight_toRightOf=\"parent\"\n" +
                    "        app:layout_constraintTop_toTopOf=\"parent\" />\n" +
                    "\n" +
                    "</androidx.constraintlayout.widget.ConstraintLayout>",
                "// MainActivity.kt\n" +
                        "import androidx.appcompat.app.AppCompatActivity\n" +
                        "import android.os.Bundle\n" +
                        "import com.google.android.youtube.player.YouTubeInitializationResult\n" +
                        "import com.google.android.youtube.player.YouTubePlayer\n" +
                        "import com.google.android.youtube.player.YouTubePlayerSupportFragment\n" +
                        "\n" +
                        "class MainActivity : AppCompatActivity(), YouTubePlayer.OnInitializedListener {\n" +
                        "\n" +
                        "\n" +
                        "    override fun onCreate(savedInstanceState: Bundle?) {\n" +
                        "        super.onCreate(savedInstanceState)\n" +
                        "        setContentView(R.layout.activity_main)\n" +
                        "\n" +
                        "        val youTubePlayerFragment =\n" +
                        "            supportFragmentManager.findFragmentById(R.id.yt_pf) as YouTubePlayerSupportFragment?\n" +
                        "        youTubePlayerFragment?.initialize(\"YOUR_API_KEY\", this)\n" +
                        "\n" +
                        "    }\n" +
                        "\n" +
                        "    override fun onInitializationSuccess(\n" +
                        "        provider: YouTubePlayer.Provider?,\n" +
                        "        player: YouTubePlayer?,\n" +
                        "        wasRestored: Boolean\n" +
                        "    ) {\n" +
                        "\n" +
                        "        // this flag will prevent video restart on screen rotation.\n" +
                        "        player?.addFullscreenControlFlag(YouTubePlayer.FULLSCREEN_FLAG_CUSTOM_LAYOUT)\n" +
                        "        if (!wasRestored) {\n" +
                        "            player?.loadVideo(\"SmLlLGjuuvU\")\n" +
                        "\n" +
                        "        } else {\n" +
                        "            player?.play()\n" +
                        "        }\n" +
                        "    }\n" +
                        "\n" +
                        "    override fun onInitializationFailure(\n" +
                        "        p0: YouTubePlayer.Provider?,\n" +
                        "        p1: YouTubeInitializationResult?\n" +
                        "    ) {\n" +
                        "\n" +
                        "    }\n" +
                        "}\n" +
                        "\n" +
                        "\n", "5j8jf6hrwv8"),
            Examples("// build.gradle\n" +
                    "implementation \"androidx.recyclerview:recyclerview:1.1.0\"\n" +
                    "implementation \"androidx.recyclerview:recyclerview-selection:1.1.0-rc01\"\n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "// item_recyclerview.xml\n" +
                    "<?xml version=\"1.0\" encoding=\"utf-8\"?>\n" +
                    "\n" +
                    "<LinearLayout xmlns:android=\"http://schemas.android.com/apk/res/android\"\n" +
                    "    android:layout_width=\"match_parent\"\n" +
                    "    android:layout_height=\"60dp\"\n" +
                    "    android:background=\"@android:color/white\"\n" +
                    "    android:baselineAligned=\"false\"\n" +
                    "    android:orientation=\"horizontal\">\n" +
                    "\n" +
                    "    <TextView\n" +
                    "        android:id=\"@+id/txvTitle\"\n" +
                    "        android:layout_width=\"match_parent\"\n" +
                    "        android:layout_height=\"wrap_content\"\n" +
                    "        android:layout_gravity=\"center_horizontal|center_vertical\"\n" +
                    "        android:gravity=\"center_vertical|center_horizontal\"\n" +
                    "        android:textColor=\"#616161\"\n" +
                    "        android:textSize=\"22sp\"\n" +
                    "        android:textStyle=\"bold\" />\n" +
                    "\n" +
                    "</LinearLayout>\n" +
                    "\n" +
                    "\n" +
                    "// activity_main\n" +
                    "<?xml version=\"1.0\" encoding=\"utf-8\"?>\n" +
                    "\n" +
                    "<LinearLayout xmlns:android=\"http://schemas.android.com/apk/res/android\"\n" +
                    "    android:layout_width=\"match_parent\"\n" +
                    "    android:layout_height=\"match_parent\">\n" +
                    "\n" +
                    "    <androidx.recyclerview.widget.RecyclerView\n" +
                    "        android:id=\"@+id/tutorialsRecyclerView\"\n" +
                    "        android:layout_width=\"match_parent\"\n" +
                    "        android:layout_height=\"match_parent\" />\n" +
                    "\n" +
                    "</LinearLayout>\n" +
                    "\n" +
                    "\n" +
                    "// detail_activity\n" +
                    "<?xml version=\"1.0\" encoding=\"utf-8\"?>\n" +
                    "<LinearLayout xmlns:android=\"http://schemas.android.com/apk/res/android\"\n" +
                    "    android:layout_width=\"match_parent\"\n" +
                    "    android:layout_height=\"match_parent\"\n" +
                    "    android:orientation=\"horizontal\">\n" +
                    "\n" +
                    "    <TextView\n" +
                    "        android:background=\"#78909C\"\n" +
                    "        android:id=\"@+id/txvTitle\"\n" +
                    "        android:layout_width=\"match_parent\"\n" +
                    "        android:layout_height=\"match_parent\"\n" +
                    "        android:layout_gravity=\"center_horizontal|center_vertical\"\n" +
                    "        android:gravity=\"center_vertical|center_horizontal\"\n" +
                    "        android:text=\"this is detail activity\"\n" +
                    "        android:textColor=\"#fff\"\n" +
                    "        android:textSize=\"22sp\"\n" +
                    "        android:textStyle=\"bold\" />\n" +
                    "\n" +
                    "</LinearLayout>\n" +
                    "\n",
                "// Model.kt\n" +
                        "data class Tutorials(var title: String)\n" +
                        "\n" +
                        "object Supplier {\n" +
                        "\n" +
                        "    val tutorials = listOf(\n" +
                        "        Tutorials(\"Tutorial 1\"),\n" +
                        "        Tutorials(\"Tutorial 2\"),\n" +
                        "        Tutorials(\"Tutorial 3\"),\n" +
                        "        Tutorials(\"Tutorial 4\"),\n" +
                        "        Tutorials(\"Tutorial 5\"),\n" +
                        "        Tutorials(\"Tutorial 6\"),\n" +
                        "        Tutorials(\"Tutorial 7\"),\n" +
                        "        Tutorials(\"Tutorial 8\"),\n" +
                        "        Tutorials(\"Tutorial 9\"),\n" +
                        "        Tutorials(\"Tutorial 10\"),\n" +
                        "        Tutorials(\"Tutorial 11\"),\n" +
                        "        Tutorials(\"Tutorial 12\"),\n" +
                        "        Tutorials(\"Tutorial 13\"),\n" +
                        "        Tutorials(\"Tutorial 14\"),\n" +
                        "        Tutorials(\"Tutorial 15\")\n" +
                        "    )\n" +
                        "}\n" +
                        "\n" +
                        "\n" +
                        "// Adapter.kt\n" +
                        "import android.content.Context\n" +
                        "import android.content.Intent\n" +
                        "import android.view.LayoutInflater\n" +
                        "import android.view.View\n" +
                        "import android.view.ViewGroup\n" +
                        "import androidx.recyclerview.widget.RecyclerView\n" +
                        "import com.yishay.myapplication.model.Tutorials\n" +
                        "import kotlinx.android.synthetic.main.item_recyclerview.view.*\n" +
                        "\n" +
                        "// tha adapter receives a context and a list to display\n" +
                        "class Adapter(val context: Context, private val tutorials: List<Tutorials>) :\n" +
                        "    RecyclerView.Adapter<Adapter.MyViewHolder>() {\n" +
                        "\n" +
                        "\n" +
                        "// inflate item layout\n" +
                        "    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {\n" +
                        "        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_recyclerview, parent, false)\n" +
                        "        return MyViewHolder(view)\n" +
                        "    }\n" +
                        "\n" +
                        "    override fun getItemCount(): Int {\n" +
                        "        return tutorials.size\n" +
                        "    }\n" +
                        "\n" +
                        "    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {\n" +
                        "        val tutorial = tutorials[position]\n" +
                        "        holder.setData(tutorial, position)\n" +
                        "\n" +
                        "    }\n" +
                        "\n" +
                        "    inner class MyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {\n" +
                        "\n" +
                        "        var currentTutorial: Tutorials? = null\n" +
                        "        var currentPosition: Int = 0\n" +
                        "\n" +
                        "\n" +
                        "        init {\n" +
                        "            itemView.setOnClickListener {\n" +
                        "                currentTutorial?.let {\n" +
                        "                    itemView.setOnClickListener {\n" +
                        "                        context.startActivity(Intent(context, DetailActivity::class.java))\n" +
                        "                    }\n" +
                        "                }\n" +
                        "            }\n" +
                        "\n" +
                        "        }\n" +
                        "// put text in layout\n" +
                        "        fun setData(tutorials: Tutorials?, pos: Int) {\n" +
                        "            tutorials?.let {\n" +
                        "                itemView.txvTitle.text = tutorials.title\n" +
                        "            }\n" +
                        "\n" +
                        "            this.currentTutorial = tutorials\n" +
                        "            this.currentPosition = pos\n" +
                        "        }\n" +
                        "    }\n" +
                        "}\n" +
                        "\n" +
                        "\n" +
                        "// MainActivity.kt\n" +
                        "import androidx.appcompat.app.AppCompatActivity\n" +
                        "import android.os.Bundle\n" +
                        "import androidx.recyclerview.widget.LinearLayoutManager\n" +
                        "import androidx.recyclerview.widget.RecyclerView\n" +
                        "import com.yishay.myapplication.model.Supplier\n" +
                        "\n" +
                        "class MainActivity : AppCompatActivity() {\n" +
                        "\n" +
                        "\n" +
                        "    override fun onCreate(savedInstanceState: Bundle?) {\n" +
                        "        super.onCreate(savedInstanceState)\n" +
                        "        setContentView(R.layout.activity_main)\n" +
                        "\n" +
                        "\n" +
                        "        val layoutManager = LinearLayoutManager(this)\n" +
                        "        layoutManager.orientation = LinearLayoutManager.VERTICAL\n" +
                        "        val recyclerView = findViewById<RecyclerView>(R.id.tutorialsRecyclerView)\n" +
                        "\n" +
                        "        recyclerView.layoutManager = layoutManager\n" +
                        "\n" +
                        "        // pass into the adapter a context and a list to display\n" +
                        "        val adapter = Adapter(this, Supplier.tutorials)\n" +
                        "\n" +
                        "        //this is our recyclerview in the activity.main layout\n" +
                        "        recyclerView.adapter = adapter\n" +
                        "\n" +
                        "    }\n" +
                        "\n" +
                        "}\n" +
                        "\n" +
                        "\n" +
                        "// DetailActivity.kt\n" +
                        "import androidx.appcompat.app.AppCompatActivity\n" +
                        "import android.os.Bundle\n" +
                        "\n" +
                        "class DetailActivity : AppCompatActivity() {\n" +
                        "    override fun onCreate(savedInstanceState: Bundle?) {\n" +
                        "        super.onCreate(savedInstanceState)\n" +
                        "        setContentView(R.layout.detail_activity)\n" +
                        "    }\n" +
                        "}", "jw690VYZfSo"),
            Examples("// build.gradle\n" +
                    "android {\n" +
                    "    compileSdkVersion 29\n" +
                    "    buildToolsVersion \"29.0.2\"\n" +
                    "\n" +
                    "    defaultConfig {\n" +
                    "        applicationId \"com.yishay.myapplication\"\n" +
                    "        minSdkVersion 15\n" +
                    "        targetSdkVersion 29\n" +
                    "        versionCode 1\n" +
                    "        versionName \"1.0\"\n" +
                    "        testInstrumentationRunner \"androidx.test.runner.AndroidJUnitRunner\"\n" +
                    "\n" +
                    "        kotlinOptions {\n" +
                    "            jvmTarget = '1.8'\n" +
                    "        }\n" +
                    "    }\n" +
                    "\n" +
                    " // ViewModel\n" +
                    "    implementation \"androidx.lifecycle:lifecycle-viewmodel-ktx:2.2.0\"\n" +
                    "\n" +
                    "    // LiveData\n" +
                    "    implementation \"androidx.lifecycle:lifecycle-livedata-ktx:2.2.0\"\n" +
                    "\n" +
                    "    // Lifecycle\n" +
                    "    implementation 'androidx.legacy:legacy-support-v4:1.0.0'\n" +
                    "    implementation 'androidx.lifecycle:lifecycle-extensions:2.2.0'\n" +
                    "    implementation \"android.arch.lifecycle:extensions:1.1.1\"\n" +
                    "\n" +
                    "\n" +
                    "    implementation \"androidx.activity:activity-ktx:1.1.0\"\n" +
                    "    implementation \"androidx.fragment:fragment-ktx:1.2.5\"\n" +
                    "\n" +
                    "\n" +
                    "// activty_main.xml\n" +
                    "<?xml version=\"1.0\" encoding=\"utf-8\"?>\n" +
                    "\n" +
                    "<LinearLayout\n" +
                    "    xmlns:android=\"http://schemas.android.com/apk/res/android\"\n" +
                    "    xmlns:app=\"http://schemas.android.com/apk/res-auto\"\n" +
                    "    android:layout_width=\"match_parent\"\n" +
                    "    android:layout_height=\"match_parent\"\n" +
                    "    android:orientation=\"vertical\">\n" +
                    "\n" +
                    "    <TextView\n" +
                    "        android:id=\"@+id/textView\"\n" +
                    "        android:layout_width=\"wrap_content\"\n" +
                    "        android:layout_height=\"wrap_content\"\n" +
                    "        android:layout_gravity=\"center_horizontal|center_vertical\"\n" +
                    "        android:text=\"Example\"\n" +
                    "        android:textColor=\"@color/grayText\"\n" +
                    "        android:textSize=\"30sp\"\n" +
                    "        android:textStyle=\"bold\" />\n" +
                    "\n" +
                    "    <EditText\n" +
                    "        android:id=\"@+id/editText\"\n" +
                    "        android:layout_width=\"match_parent\"\n" +
                    "        android:layout_height=\"wrap_content\"\n" +
                    "        android:textSize=\"30sp\"\n" +
                    "        android:ems=\"10\"\n" +
                    "        android:inputType=\"textPersonName\"\n" +
                    "       android:hint=\"Enter Your Name\" />\n" +
                    "\n" +
                    "    <Button\n" +
                    "        android:id=\"@+id/button\"\n" +
                    "        android:layout_width=\"match_parent\"\n" +
                    "        android:layout_height=\"60dp\"\n" +
                    "        android:textSize=\"30sp\"\n" +
                    "        android:onClick=\"changeText\"\n" +
                    "        android:text=\"Button\" />\n" +
                    "</LinearLayout>\n", "// ViewModel\n" +
                    "import androidx.lifecycle.LiveData\n" +
                    "import androidx.lifecycle.MutableLiveData\n" +
                    "import androidx.lifecycle.ViewModel\n" +
                    "\n" +
                    "\n" +
                    "class ViewModel : ViewModel() {\n" +
                    "\n" +
                    "    private val _currentName = MutableLiveData<String>()\n" +
                    "    val currentName: LiveData<String>\n" +
                    "        //  getter immutable LiveData<String>\n" +
                    "        get() = _currentName\n" +
                    "\n" +
                    "    init {\n" +
                    "        _currentName.value = \"empty\"\n" +
                    "    }\n" +
                    "\n" +
                    "\n" +
                    "    fun addName(name: String) {\n" +
                    "        _currentName.value = name\n" +
                    "    }\n" +
                    "\n" +
                    "    fun getName() = currentName\n" +
                    "}\n" +
                    "\n" +
                    "\n" +
                    "// MainActivity.kt\n" +
                    "import androidx.appcompat.app.AppCompatActivity\n" +
                    "import android.os.Bundle\n" +
                    "import android.view.View\n" +
                    "import android.widget.EditText\n" +
                    "import android.widget.TextView\n" +
                    "import androidx.activity.viewModels\n" +
                    "import androidx.lifecycle.Observer\n" +
                    "\n" +
                    "\n" +
                    "class MainActivity : AppCompatActivity() {\n" +
                    "\n" +
                    "    val nameViewModel : ViewModel by viewModels()\n" +
                    "\n" +
                    "\n" +
                    "    override fun onCreate(savedInstanceState: Bundle?) {\n" +
                    "        super.onCreate(savedInstanceState)\n" +
                    "        setContentView(R.layout.activity_main)\n" +
                    "\n" +
                    "\n" +
                    "        val nameObserver = Observer<String> { CurrentName ->\n" +
                    "\n" +
                    "            val textView: TextView = findViewById(R.id.textView)\n" +
                    "\n" +
                    "            textView.text = CurrentName\n" +
                    "\n" +
                    "        }\n" +
                    "\n" +
                    "        nameViewModel.getName().observe(this, nameObserver)\n" +
                    "\n" +
                    "    }\n" +
                    "\n" +
                    "\n" +
                    "    fun changeText(view: View) {\n" +
                    "        val editText: EditText  = findViewById(R.id.editText)\n" +
                    "        val text = editText.text.toString()\n" +
                    "\n" +
                    "        nameViewModel.addName(text)\n" +
                    "    }\n" +
                    "\n" +
                    "}", "X1t346JkStg"),
            Examples("// build.gradle\n" +
                    "apply plugin: 'kotlin-kapt'\n" +
                    "\n" +
                    "android {\n" +
                    "    dataBinding {\n" +
                    "        enabled = true\n" +
                    "    }\n" +
                    "}\n" +
                    "\n" +
                    "// ViewModel\n" +
                    "    implementation \"androidx.lifecycle:lifecycle-viewmodel-ktx:2.2.0\"\n" +
                    "\n" +
                    "    // LiveData\n" +
                    "    implementation \"androidx.lifecycle:lifecycle-livedata-ktx:2.2.0\"\n" +
                    "\n" +
                    "    // Lifecycle\n" +
                    "    implementation 'androidx.legacy:legacy-support-v4:1.0.0'\n" +
                    "\n" +
                    "    implementation \"androidx.activity:activity-ktx:1.1.0\"\n" +
                    "    implementation \"androidx.fragment:fragment-ktx:1.2.5\"\n" +
                    "\n" +
                    "// ViewModel\n" +
                    "    implementation \"androidx.lifecycle:lifecycle-viewmodel-ktx:2.2.0\"\n" +
                    "\n" +
                    "// LiveData\n" +
                    "    implementation \"androidx.lifecycle:lifecycle-livedata-ktx:2.2.0\"\n" +
                    "\n" +
                    "// Lifecycle\n" +
                    "implementation 'androidx.legacy:legacy-support-v4:1.0.0'\n" +
                    "\n" +
                    "implementation \"androidx.activity:activity-ktx:1.1.0\"\n" +
                    " implementation \"androidx.fragment:fragment-ktx:1.2.5\"\n" +
                    "\n" +
                    "// activiy_main.xml\n" +
                    "<?xml version=\"1.0\" encoding=\"utf-8\"?>\n" +
                    "<layout xmlns:android=\"http://schemas.android.com/apk/res/android\"\n" +
                    "    xmlns:app=\"http://schemas.android.com/apk/res-auto\"\n" +
                    "    xmlns:tools=\"http://schemas.android.com/tools\">\n" +
                    "\n" +
                    "    <data>\n" +
                    "        <variable\n" +
                    "            name=\"viewmodel\"\n" +
                    "            type=\"com.yishay.myapplication.ViewModel\" />\n" +
                    "    </data>\n" +
                    "\n" +
                    "    <LinearLayout\n" +
                    "        android:layout_width=\"match_parent\"\n" +
                    "        android:layout_height=\"match_parent\"\n" +
                    "        android:orientation=\"vertical\"\n" +
                    "        tools:context=\".MainActivity\">\n" +
                    "\n" +
                    "        <TextView\n" +
                    "            android:id=\"@+id/textView\"\n" +
                    "            android:layout_width=\"wrap_content\"\n" +
                    "            android:layout_height=\"wrap_content\"\n" +
                    "            android:layout_gravity=\"center_horizontal|center_vertical\"\n" +
                    "            android:text=\"@{viewmodel.currentName}\"\n" +
                    "            android:textColor=\"@color/grayText\"\n" +
                    "            android:textSize=\"30sp\"\n" +
                    "            android:textStyle=\"bold\" />\n" +
                    "\n" +
                    "        <EditText\n" +
                    "            android:id=\"@+id/editText\"\n" +
                    "            android:layout_width=\"match_parent\"\n" +
                    "            android:layout_height=\"wrap_content\"\n" +
                    "            android:text=\"@={viewmodel.editTextRandom}\"\n" +
                    "            android:ems=\"10\"\n" +
                    "            android:hint=\"Enter Your Name\"\n" +
                    "            android:inputType=\"textPersonName\"\n" +
                    "            android:textSize=\"30sp\" />\n" +
                    "\n" +
                    "        <Button\n" +
                    "            android:id=\"@+id/button1\"\n" +
                    "            android:layout_width=\"match_parent\"\n" +
                    "            android:layout_height=\"60dp\"\n" +
                    "            android:onClick=\"@{() -> viewmodel.onChangeTextClick()}\"\n" +
                    "            android:text=\"bintd text to data\"\n" +
                    "            android:textSize=\"30sp\" />\n" +
                    "\n" +
                    "        <Button\n" +
                    "            android:id=\"@+id/button2\"\n" +
                    "            android:layout_width=\"match_parent\"\n" +
                    "            android:layout_height=\"60dp\"\n" +
                    "            android:onClick=\"@{() -> viewmodel.onRandomNameClick()}\"\n" +
                    "            android:text=\"bind data to text\"\n" +
                    "            android:textSize=\"30sp\" />\n" +
                    "    </LinearLayout>\n" +
                    "</layout>", "//MyRepository.kt\n" +
                    "import java.util.*\n" +
                    "\n" +
                    "object MyRepository {\n" +
                    "\n" +
                    "    private val randomName: List<String> = listOf(\n" +
                    "        \"Pit\", \"Brad\", \"Smith\", \"Bob\", \"Robert\", \"Richard\",\n" +
                    "        \"Dick\", \"Ron\", \"Dale\", \"Edgar\"\n" +
                    "    )\n" +
                    "\n" +
                    "    fun getRandName(): String {\n" +
                    "        val random = Random()\n" +
                    "        return randomName[random.nextInt(randomName.size)]\n" +
                    "\n" +
                    "    }\n" +
                    "}\n" +
                    "\n" +
                    "\n" +
                    "//ViewModel.kt\n" +
                    "import androidx.lifecycle.LiveData\n" +
                    "import androidx.lifecycle.MutableLiveData\n" +
                    "import androidx.lifecycle.ViewModel\n" +
                    "\n" +
                    "\n" +
                    "class ViewModel : ViewModel() {\n" +
                    "    \n" +
                    "    private val _currentName = MutableLiveData<String>()\n" +
                    "    val currentName: LiveData<String>\n" +
                    "        //  getter immutable LiveData<String>\n" +
                    "        get() = _currentName\n" +
                    "\n" +
                    "    init {\n" +
                    "        _currentName.value = \"empty\"\n" +
                    "    }\n" +
                    "\n" +
                    "    //     Tow way data binding\n" +
                    "    val editTextRandom = MutableLiveData<String>()\n" +
                    "\n" +
                    "    fun onChangeTextClick() {\n" +
                    "        _currentName.value = editTextRandom.value\n" +
                    "    }\n" +
                    "\n" +
                    "    fun onRandomNameClick() {\n" +
                    "        editTextRandom.value = MyRepository.getRandName()\n" +
                    "    }\n" +
                    "    \n" +
                    "}\n" +
                    "\n" +
                    "\n" +
                    "//MainActivity.kt\n" +
                    "import androidx.appcompat.app.AppCompatActivity\n" +
                    "import android.os.Bundle\n" +
                    "import android.widget.Toast\n" +
                    "import androidx.activity.viewModels\n" +
                    "import androidx.databinding.DataBindingUtil\n" +
                    "import androidx.lifecycle.Observer\n" +
                    "import com.yishay.myapplication.databinding.ActivityMainBinding\n" +
                    "\n" +
                    "\n" +
                    "class MainActivity : AppCompatActivity() {\n" +
                    "\n" +
                    "    val nameViewModel : ViewModel by viewModels()\n" +
                    "\n" +
                    "\n" +
                    "    override fun onCreate(savedInstanceState: Bundle?) {\n" +
                    "        super.onCreate(savedInstanceState)\n" +
                    "        setContentView(R.layout.activity_main)\n" +
                    "\n" +
                    "\n" +
                    "        DataBindingUtil.setContentView<ActivityMainBinding>(\n" +
                    "            this, R.layout.activity_main\n" +
                    "        ).apply {\n" +
                    "            this.setLifecycleOwner(this@MainActivity)\n" +
                    "            this.viewmodel = nameViewModel\n" +
                    "        }\n" +
                    "\n" +
                    "        nameViewModel.currentName.observe(this, Observer {\n" +
                    "            Toast.makeText(this, it, Toast.LENGTH_SHORT).show()\n" +
                    "        })\n" +
                    "    }\n" +
                    "\n" +
                    "}", "FWwbWlMqtzo"),
            Examples("// build.gradle\n" +
                    "implementation \"androidx.cardview:cardview:1.0.0\"\n" +
                    "\n" +
                    "\n" +
                    "// activity_main.xml\n" +
                    "<?xml version=\"1.0\" encoding=\"utf-8\"?>\n" +
                    "<LinearLayout android:layout_width=\"match_parent\"\n" +
                    "    android:layout_height=\"match_parent\"\n" +
                    "    android:orientation=\"vertical\"\n" +
                    "    android:background=\"#26A69A\"\n" +
                    "    xmlns:android=\"http://schemas.android.com/apk/res/android\">\n" +
                    "<androidx.cardview.widget.CardView android:id=\"@+id/examples\"\n" +
                    "    android:layout_width=\"match_parent\"\n" +
                    "    android:layout_height=\"70dp\"\n" +
                    "    android:layout_marginLeft=\"20dp\"\n" +
                    "    android:layout_marginTop=\"20dp\"\n" +
                    "    android:layout_marginRight=\"20dp\"\n" +
                    "    app:cardCornerRadius=\"18dp\"\n" +
                    "    app:cardMaxElevation=\"20dp\"\n" +
                    "    xmlns:android=\"http://schemas.android.com/apk/res/android\"\n" +
                    "    xmlns:app=\"http://schemas.android.com/apk/res-auto\">\n" +
                    "\n" +
                    "    <LinearLayout\n" +
                    "        android:layout_width=\"match_parent\"\n" +
                    "        android:layout_height=\"match_parent\">\n" +
                    "\n" +
                    "        <ImageView\n" +
                    "            android:layout_width=\"wrap_content\"\n" +
                    "            android:layout_height=\"wrap_content\"\n" +
                    "            android:layout_gravity=\"center\"\n" +
                    "            android:layout_weight=\"1\"\n" +
                    "            android:src=\"@drawable/ic_school_teal_35dp\" />\n" +
                    "\n" +
                    "        <TextView\n" +
                    "            android:layout_width=\"wrap_content\"\n" +
                    "            android:layout_height=\"wrap_content\"\n" +
                    "            android:layout_gravity=\"center_horizontal|center_vertical\"\n" +
                    "            android:layout_weight=\"2\"\n" +
                    "            android:text=\"Examples\"\n" +
                    "            android:textColor=\"@color/grayText\"\n" +
                    "            android:textSize=\"22sp\"\n" +
                    "            android:textStyle=\"bold\" />\n" +
                    "\n" +
                    "    </LinearLayout>\n" +
                    "\n" +
                    "</androidx.cardview.widget.CardView>\n" +
                    "</LinearLayout>", "CardView can then be accessed from code if needed\n" +
                    "or be created programmatically.\n" +
                    "val card_view = CardView(this) ...",
                "OIyxNMMdyZ8"),
            Examples("// gradient_background.xml\n" +
                    "<?xml version=\"1.0\" encoding=\"utf-8\"?>\n" +
                    "<shape xmlns:android=\"http://schemas.android.com/apk/res/android\">\n" +
                    "    <gradient\n" +
                    "        android:angle=\"90\"\n" +
                    "        android:endColor=\"@color/teal400\"\n" +
                    "        android:startColor=\"@color/blueGray400\"\n" +
                    "        android:type=\"linear\" />\n" +
                    "</shape>\n" +
                    "\n" +
                    "\n" +
                    "// layout.xml\n" +
                    "<?xml version=\"1.0\" encoding=\"utf-8\"?>\n" +
                    "<androidx.core.widget.NestedScrollView xmlns:android=\"http://schemas.android.com/apk/res/android\"\n" +
                    "    xmlns:app=\"http://schemas.android.com/apk/res-auto\"\n" +
                    "    android:layout_width=\"match_parent\"\n" +
                    "    android:layout_height=\"match_parent\"\n" +
                    "    android:background=\"@drawable/gradient_background\">\n" +
                    "</androidx.core.widget.NestedScrollView>",
                "override fun onCreate(savedInstanceState: Bundle?) {\n" +
                    "        super.onCreate(savedInstanceState)\n" +
                    "        setContentView(R.layout.activity_gradient)\n" +
                    "\n" +
                    "    }", "24brvgIG_mI")

        )

    }
}