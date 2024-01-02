import ExpoModulesCore

public class PokemonModule: Module {

  public func definition() -> ModuleDefinition {

    Name("Pokemon")

    View(PokemonView.self) {
      Prop("name") { (view: PokemonView, prop: String) in
        print(prop)
      }
    }
  }
}
