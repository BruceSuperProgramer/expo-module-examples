package expo.modules.pokemon.modules

import LandmarkRecord
import expo.modules.kotlin.modules.Module
import expo.modules.kotlin.modules.ModuleDefinition
import expo.modules.pokemon.screens.index

class PokemonModule : Module() {
    private var mainView: index? = null
    override fun definition() = ModuleDefinition {

        Name("Pokemon")

        Function("hello") {
            "Hello world! 👋"
        }

        Function("deleteLastItem") {
            mainView?.post {
                mainView?.viewModel?.deleteLastItem()
            }
        }

        View(index::class) {
            Prop("listData") { view: index, prop: Array<LandmarkRecord> ->
                mainView = view;
                view.viewModel.updateData(prop)
            }
        }
    }
}
