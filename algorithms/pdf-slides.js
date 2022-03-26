// Loaded via <script> tag, create shortcut to access PDF.js exports.
var pdfjsLib = window['pdfjs-dist/build/pdf'];

$(".pdf-slides").each((index, element) => {
    var url = element.dataset.pdf;

    var pdfDoc = null,
        pageNum = 1,
        pageRendering = false,
        pageNumPending = null,
        scale = 2,
        canvas = document.createElement("canvas"),
        ctx = canvas.getContext('2d');
    element.append(canvas);

    var buttonRow = document.createElement("div");
    buttonRow.classList.add("button-row");
    element.append(buttonRow);

    var prevButton = document.createElement("button");
    prevButton.classList.add("prev-button");
    prevButton.append("Previous");
    buttonRow.append(prevButton);

    var downloadButton = document.createElement("button");
    downloadButton.append("Download");
    downloadButton.addEventListener('click', function() {
        location.href = url;
    });
    buttonRow.append(downloadButton);

    var nextButton = document.createElement("button");
    nextButton.classList.add("next-button");
    nextButton.append("Next");
    buttonRow.append(nextButton);

    /**
     * Get page info from document, resize canvas accordingly, and render page.
     * @param num Page number.
     */
    function renderPage(num) {
        pageRendering = true;
        // Using promise to fetch the page
        pdfDoc.getPage(num).then(function (page) {
            var viewport = page.getViewport({ scale: scale });
            canvas.height = viewport.height;
            canvas.width = viewport.width;

            // Render PDF page into canvas context
            var renderContext = {
                canvasContext: ctx,
                viewport: viewport
            };
            var renderTask = page.render(renderContext);

            // Wait for rendering to finish
            renderTask.promise.then(function () {
                pageRendering = false;
                if (pageNumPending !== null) {
                    // New page rendering is pending
                    renderPage(pageNumPending);
                    pageNumPending = null;
                }
            });
        });
    }

    /**
     * If another page rendering in progress, waits until the rendering is
     * finised. Otherwise, executes rendering immediately.
     */
    function queueRenderPage(num) {
        if (pageRendering) {
            pageNumPending = num;
        } else {
            renderPage(num);
        }
    }

    /**
     * Displays previous page.
     */
    function onPrevPage() {
        if (pageNum <= 1) {
            return;
        }
        pageNum--;
        queueRenderPage(pageNum);
    }
    prevButton.addEventListener('click', onPrevPage);

    /**
     * Displays next page.
     */
    function onNextPage() {
        if (pageNum >= pdfDoc.numPages) {
            return;
        }
        pageNum++;
        queueRenderPage(pageNum);
    }
    nextButton.addEventListener('click', onNextPage);

    /**
     * Asynchronously downloads PDF.
     */
    pdfjsLib.getDocument(url).promise.then(function (pdfDoc_) {
        pdfDoc = pdfDoc_;

        // Initial/first page rendering
        renderPage(pageNum);
    });

});