import kotlinx.browser.document
import kotlinx.browser.window
import kotlinx.css.*
import react.dom.*
import styled.css
import styled.styledDiv

data class Video(val id: Int, val title: String, val speaker: String, val videoUrl: String)


fun main() {
    val unwatchedVideos = listOf(
        Video(1, "Building and breaking things", "John Doe", "https://youtu.be/PsaFVLr8t4E"),
        Video(2, "The development process", "Jane Smith", "https://youtu.be/PsaFVLr8t4E"),
        Video(3, "The Web 7.0", "Matt Miller", "https://youtu.be/PsaFVLr8t4E")
    )

    val watchedVideos = listOf(
        Video(4, "Mouseless development", "Tom Jerry", "https://youtu.be/PsaFVLr8t4E")
    )

    window.onload = {
        render(document.getElementById("root")) {
            h1 {
                +"Hello, Kotlin/JS + React!"
            }
            div {
                h3 {
                    +"Videos to watch"
                }
                for (video in unwatchedVideos) {
                    p {
                        +"${video.speaker}: ${video.title}"
                    }
                }
                h3 {
                    +"Videos watched"
                }
                for (video in watchedVideos) {
                    p {
                        +"${video.speaker}: ${video.title}"
                    }
                }
            }

            styledDiv {
                css {
                    position = Position.absolute
                    top = 10.px
                    right = 20.px
                }
                h3 {
                    +"John Doe: Building and breaking things"
                }
                img {
                    attrs {
                        src = "https://via.placeholder.com/640x360.png?text=Video+Player+Placeholder"
                    }
                }
            }
        }
    }
//        render(document.getElementById("root")) {
//            child(Welcome::class) {
//                attrs {
//                    name = "Kotlin/JS"
//                }
//            }
//        }
}

// h1 is really a function that takes a lambda parameter.
// When we write +, we are really invoking the function unaryPlus (through operator overloading)
// which takes care of appending the string to the enclosed HTML element.
// Simply put, you can think of the + as "append my string inside this element."

