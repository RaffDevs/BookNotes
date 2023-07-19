package com.example.booknotes.app.searchbooks.data.entities

data class GoogleBookEntity(
    val kind: String,
    val id: String,
    val etag: String,
    val selfLink: String,
    val volumeInfo: VolumeInfo,
    val saleInfo: SaleInfo,
    val accessInfo: AccessInfo,
    val searchInfo: SearchInfo

) {
    data class VolumeInfo(
        val title: String,
        val authors: List<String>,
        val publisher: String,
        val publishedData: String,
        val description: String,
        val industryIdentifiers: List<IndustryIdentifiers>,
        val readingModes: ReadingMode,
        val pageCount: Int,
        val printType: String,
        val categories: List<String>,
        val maturityRating: String,
        val allowAnonLogin: Boolean,
        val contentVersion: String,
        val panelizationSummary: PanelizationSummary,
        val imageLinks: ImageLinks,
        val language: String,
        val previewLink: String,
        val infoLink: String,
        val canonicalVolumeLink: String

    ) {
        data class IndustryIdentifiers(
            val type: String,
            val identifier: String
        )

        data class ReadingMode(
            val text: Boolean,
            val image: Boolean
        )

        data class PanelizationSummary(
            val containsEpubBubbles: Boolean,
            val containsImageBubbles: Boolean
        )

        data class ImageLinks(
            val smallThumbnail: String,
            val thumbnail: String
        )
    }



    data class SaleInfo(
        val country: String,
        val saleability: String,
        val isEbook: Boolean
    )

    data class AccessInfo(
        val country: String,
        val viewability: String,
        val embeddable: Boolean,
        val publicDomain: Boolean,
        val textToSpeechPermission: String,
        val epub: Epub,
        val pdf: Pdf,
        val webReaderLink: String,
        val accessViewStatus: String,
        val quoteSharingAllowed: Boolean

    ) {
        data class Epub(
            val isAvailable: Boolean
        )

        data class Pdf(
            val isAvailable: Boolean
        )
    }

    data class SearchInfo(
        val textSnippet: String
    )
}

