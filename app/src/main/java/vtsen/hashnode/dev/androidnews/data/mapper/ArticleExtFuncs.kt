package vtsen.hashnode.dev.androidnews.data.mapper

import vtsen.hashnode.dev.androidnews.data.local.ArticleEntity
import vtsen.hashnode.dev.androidnews.domain.model.Article

fun Article.toArticleEntity(
    bookmarked: Boolean? = null,
    read: Boolean? = null,
) : ArticleEntity {

    return ArticleEntity(
        id = link.toUrlPath(),
        title = title,
        link = link,
        author = author,
        pubDate = pubDate,
        image = image,
        bookmarked = bookmarked ?: this.bookmarked,
        read = read ?: this.read,

        feedTitle = feedTitle,
    )
}