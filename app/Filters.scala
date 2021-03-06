import javax.inject._
import play.api.http.DefaultHttpFilters
import play.filters.cors._

/**
 * This class configures filters that run on every request. This
 * class is queried by Play to get a list of filters.
 *
 * Play will automatically use filters from any class called
 * `Filters` that is placed the root package. You can load filters
 * from a different class by adding a `play.http.filters` setting to
 * the `application.conf` configuration file.
 *
 * each response.
 */


@Singleton
class Filters @Inject()(corsFilter: CORSFilter) extends DefaultHttpFilters(corsFilter){

}
