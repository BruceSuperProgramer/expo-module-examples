import Foundation

//var landmarks: [Landmark] = load("landmarkData.json")
//var landmarks: [Landmark] = []

//func load<T: Decodable>(_ filename: String) -> T {
//    let data: Data
//
//
//    guard let file = Bundle.main.url(forResource: filename, withExtension: nil)
//    else {
//        fatalError("Couldn't find \(filename) in main bundle.")
//    }
//    
//   do {
//       data = try Data(contentsOf: file)
//   } catch {
//       fatalError("Couldn't load \(filename) from main bundle:\n\(error)")
//   }
//
//
//   do {
//       let decoder = JSONDecoder()
//
//       let result = try decoder.decode(T.self, from: data);
//       return result
//   } catch {
//       fatalError("Couldn't parse \(filename) as \(T.self):\n\(error)")
//   }
//}
