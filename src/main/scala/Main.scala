object Main extends App {
  import com.google.zxing.qrcode.QRCodeWriter
  import com.google.zxing.BarcodeFormat
  import com.google.zxing.client.j2se.MatrixToImageWriter
  import java.nio.file.FileSystems

  val width = 320
  val height = 320
  val url = args(0)
  val writer = new QRCodeWriter()
  val matrix = writer.encode(url, BarcodeFormat.QR_CODE, width, height)
  val path = FileSystems.getDefault.getPath(args(1))
  MatrixToImageWriter.writeToPath(matrix, "PNG", path)
}